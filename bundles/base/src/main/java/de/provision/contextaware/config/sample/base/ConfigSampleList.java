/* Copyright (c) pro!vision GmbH. All rights reserved. */
package de.provision.contextaware.config.sample.base;

import org.apache.sling.caconfig.annotation.Configuration;

/**
 * Config annotation class example
 */
@Configuration
public @interface ConfigSampleList {

  /**
   * @return String parameter
   */
  String stringParam();

}
