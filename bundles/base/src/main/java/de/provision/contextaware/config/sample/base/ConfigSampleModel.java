/* Copyright (c) pro!vision GmbH. All rights reserved. */
package de.provision.contextaware.config.sample.base;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.caconfig.ConfigurationBuilder;
import org.apache.sling.models.annotations.Model;

/**
 * Sling model example
 */
@Model(adaptables = Resource.class)
public class ConfigSampleModel {

  private ConfigSample config;

  /**
   * @param resource Current resource
   */
  public ConfigSampleModel(Resource resource) {
    this.config = resource.adaptTo(ConfigurationBuilder.class).as(ConfigSample.class);
  }

  /**
   * @return Configuration object
   */
  public ConfigSample getConfig() {
    return this.config;
  }

}
