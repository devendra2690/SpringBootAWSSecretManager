package com.aws.secretsmanager.store.controller;

import com.aws.secretsmanager.store.config.DataSourceConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class FetchAWSSecretManagerController {

    private final DataSourceConfig dataSourceConfig;

    public FetchAWSSecretManagerController(DataSourceConfig dataSourceConfig) {
        this.dataSourceConfig = dataSourceConfig;
    }

    @GetMapping("/secret-manager/values")
    public Map<String,String> listAWSSecretManagerConfig() {
        Map<String,String> ssmValueMap = new HashMap<>();

        ssmValueMap.put("DB_URL",dataSourceConfig.getDbUrl());
        ssmValueMap.put("DB_Username",dataSourceConfig.getDbUsername());
        ssmValueMap.put("DB_Password",dataSourceConfig.getDbPassword());

         return ssmValueMap;
    }
}
