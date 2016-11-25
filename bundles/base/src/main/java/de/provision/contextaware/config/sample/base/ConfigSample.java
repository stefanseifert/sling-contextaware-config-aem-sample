/* Copyright (c) pro!vision GmbH. All rights reserved. */
package de.provision.contextaware.config.sample.base;

import org.apache.sling.caconfig.annotation.Configuration;
import org.apache.sling.caconfig.annotation.Property;

/**
 * Config annotation class example
 */
@Configuration(label = "Sample Configuration", description = "This is a sample configuration.")
public @interface ConfigSample {

  /**
   * @return String parameter
   */
  @Property(label = "String Param", description = "This is a string parameter in the singleton configuration.")
  String stringParam();

  /**
   * @return Integer parameter
   */
  @Property(label = "Integer Param")
  int intParam();

  /**
   * @return Boolean parameter
   */
  @Property(label = "Boolean Param")
  boolean boolParam();

  /**
   * @return String array parameter with default value
   */
  @Property(label = "String Array Param")
  String[] stringArrayParam() default {
    "value1", "value2"
  };

}
