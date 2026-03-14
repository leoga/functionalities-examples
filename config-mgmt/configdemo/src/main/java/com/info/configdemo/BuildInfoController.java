package com.info.configdemo;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RefreshScope
@Slf4j
public class BuildInfoController {

//    @Value("${build.id:default}")
//    private String buildId;
//
//    @Value("${build.version:default}")
//    private String buildVersion;
//
//    @Value("${build.name:default}")
//    private String buildName;

    private BuildInfo buildInfo;

    @GetMapping("/build-info")
    public String getBuildInfo() {
        log.trace("Build ID: {}, Version: {}, Name: {}", buildInfo.getId(), buildInfo.getVersion(), buildInfo.getName());
        log.debug("Build ID: {}, Version: {}, Name: {}", buildInfo.getId(), buildInfo.getVersion(), buildInfo.getName());
        log.info("Build ID: {}, Version: {}, Name: {}", buildInfo.getId(), buildInfo.getVersion(), buildInfo.getName());
        log.warn("Build ID: {}, Version: {}, Name: {}", buildInfo.getId(), buildInfo.getVersion(), buildInfo.getName());
        log.error("Build ID: {}, Version: {}, Name: {}", buildInfo.getId(), buildInfo.getVersion(), buildInfo.getName());
//        return "Build ID: " + buildId + ", Version: " + buildVersion + ", Name: " + buildName;
        return "Build ID: " + buildInfo.getId() + ", Version: " + buildInfo.getVersion() + ", Name: " + buildInfo.getName();
    }

//    @GetMapping("/build-info")
//    public String getBuildInfo() {
//        return "Build ID: " + buildInfo.getId() + ", Version: " + buildInfo.getVersion() + ", Name: " + buildInfo.getName();
//    }
}
