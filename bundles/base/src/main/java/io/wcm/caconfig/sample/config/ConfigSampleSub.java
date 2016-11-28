/* Copyright (c) pro!vision GmbH. All rights reserved. */
package io.wcm.caconfig.sample.config;

import org.apache.sling.caconfig.annotation.Property;

/**
 * Nested sub config.
 */
public @interface ConfigSampleSub {

  /**
   * @return String parameter
   */
  @Property(label = "Sub String Param", description = "This is a string parameter in the ConfigSampleSub configuration.")
  String subStringParam();

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
