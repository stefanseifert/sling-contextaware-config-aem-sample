/* Copyright (c) pro!vision GmbH. All rights reserved. */
package io.wcm.caconfig.sample.model;

import java.util.Collection;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.caconfig.ConfigurationBuilder;
import org.apache.sling.models.annotations.Model;

import io.wcm.caconfig.sample.config.ConfigSample;
import io.wcm.caconfig.sample.config.ConfigSample2;
import io.wcm.caconfig.sample.config.ConfigSampleList;

/**
 * Sling model example
 */
@Model(adaptables = Resource.class)
public class ConfigSampleModel {

  private ConfigSample config;
  private ConfigSample2 config2;
  private Collection<ConfigSampleList> configList;

  /**
   * @param resource Current resource
   */
  public ConfigSampleModel(Resource resource) {
    ConfigurationBuilder configBuilder = resource.adaptTo(ConfigurationBuilder.class);
    this.config = configBuilder.as(ConfigSample.class);
    this.config2 = configBuilder.as(ConfigSample2.class);
    this.configList = configBuilder.asCollection(ConfigSampleList.class);
  }

  /**
   * @return Configuration object
   */
  public ConfigSample getConfig() {
    return this.config;
  }

  /**
   * @return Configuration object
   */
  public ConfigSample2 getConfig2() {
    return this.config2;
  }

  /**
   * @return Configuration list
   */
  public Collection<ConfigSampleList> getConfigList() {
    return this.configList;
  }

}
