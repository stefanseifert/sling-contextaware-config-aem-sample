/* Copyright (c) pro!vision GmbH. All rights reserved. */
package de.provision.contextaware.config.sample.base;

import org.apache.sling.caconfig.annotation.Configuration;

/**
 * Config annotation class example
 */
@Configuration
public @interface ConfigSample {

  /**
   * @return String parameter
   */
  String stringParam();

  /**
   * @return Integer parameter
   */
  int intParam();

  /**
   * @return Boolean parameter
   */
  boolean boolParam();

}
