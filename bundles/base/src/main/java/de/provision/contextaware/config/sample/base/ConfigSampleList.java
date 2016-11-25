/* Copyright (c) pro!vision GmbH. All rights reserved. */
package de.provision.contextaware.config.sample.base;

import org.apache.sling.caconfig.annotation.Configuration;

/**
 * Config annotation class example
 */
@Configuration(label = "Sample Configuration List", description = "This is a sample configuration list.")
public @interface ConfigSampleList {

  /**
   * @return String parameter
   */
  String stringParam();

}
