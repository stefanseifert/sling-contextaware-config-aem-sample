/* Copyright (c) pro!vision GmbH. All rights reserved. */
package de.provision.contextaware.config.sample.base;

import org.apache.sling.caconfig.annotation.Configuration;

/**
 * Config annotation class example
 */
@Configuration(label = "Sample Configuration", description = "This is a sample configuration.")
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

  /**
   * @return String array parameter with default value
   */
  String[] stringArrayParam() default {
    "value1", "value2"
  };

}
