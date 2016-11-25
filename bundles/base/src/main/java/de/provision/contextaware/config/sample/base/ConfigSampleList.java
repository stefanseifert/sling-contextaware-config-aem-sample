/* Copyright (c) pro!vision GmbH. All rights reserved. */
package de.provision.contextaware.config.sample.base;

import org.apache.sling.caconfig.annotation.Configuration;
import org.apache.sling.caconfig.annotation.Property;

/**
 * Config annotation class example
 */
@Configuration(label = "Sample Configuration List", description = "This is a sample configuration list.", collection = true)
public @interface ConfigSampleList {

  /**
   * @return String parameter
   */
  @Property(label = "String Param", description = "This is a string parameter within the configuration list.")
  String stringParam();

}
