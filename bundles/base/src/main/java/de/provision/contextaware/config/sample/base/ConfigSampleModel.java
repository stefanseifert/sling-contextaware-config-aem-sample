/* Copyright (c) pro!vision GmbH. All rights reserved. */
package de.provision.contextaware.config.sample.base;

import java.util.Collection;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.caconfig.ConfigurationBuilder;
import org.apache.sling.models.annotations.Model;

/**
 * Sling model example
 */
@Model(adaptables = Resource.class)
public class ConfigSampleModel {

  private ConfigSample config;
  private Collection<ConfigSampleList> configList;

  /**
   * @param resource Current resource
   */
  public ConfigSampleModel(Resource resource) {
    ConfigurationBuilder configBuilder = resource.adaptTo(ConfigurationBuilder.class);
    this.config = configBuilder.as(ConfigSample.class);
    this.configList = configBuilder.asCollection(ConfigSampleList.class);
  }

  /**
   * @return Configuration object
   */
  public ConfigSample getConfig() {
    return this.config;
  }

  /**
   * @return Configuration list
   */
  public Collection<ConfigSampleList> getConfigList() {
    return this.configList;
  }

}
