package com.ibhatech.opendata.worldfacts.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.devtools.filewatch.ChangedFiles;
import org.springframework.boot.devtools.filewatch.FileSystemWatcher;
import org.springframework.boot.devtools.livereload.LiveReloadServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.io.File;
import java.util.List;
import java.util.Set;

@Configuration
@Slf4j
@Profile("local")
public class LiveReloadConfig {
  @Autowired
  LiveReloadServer liveReloadServer;
  @Value("#{'${livereload.sources}'.split(',')}")
  private List<String> staticLocations;
  @Bean
  public LiveReloader liveReloader() {
    return new LiveReloader().init(liveReloadServer,staticLocations);
  }
  public static class LiveReloader implements DisposableBean {
    public  FileSystemWatcher fileSystemWatcher;
    @Override
    public void destroy() throws  Exception {
      log.info("----------Context shutting down. stopping live re-loader for source folders -----");
      if(fileSystemWatcher!=null)fileSystemWatcher.stop();
    }
    public LiveReloader init( LiveReloadServer liveReloadServer, List<String> staticLocations) {
      fileSystemWatcher = new FileSystemWatcher();
      Iterable<File> folders = staticLocations.stream().map(m -> new File(m)).toList();
      fileSystemWatcher.addSourceDirectories(folders);
      fileSystemWatcher.addListener(__ -> {
       // log.info("reloading template");
        liveReloadServer.triggerReload();
      });
      fileSystemWatcher.start();
      return this;
    }
  }


}
