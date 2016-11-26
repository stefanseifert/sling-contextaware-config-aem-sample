/* Copyright (c) pro!vision GmbH. All rights reserved. */
package io.wcm.caconfig.sample.config;

import org.apache.sling.caconfig.annotation.Configuration;
import org.apache.sling.caconfig.annotation.Property;

/**
 * Another config annotation class example
 */
@Configuration(label = "Sample Configuration 2", description = "This is another sample configuration.")
public @interface ConfigSample2 {

  /**
   * @return String parameter
   */
  @Property(label = "String Param", description = "This is a string parameter in the singleton configuration.")
  String stringParam() default "Default Value";

  /**
   * @return Integer parameter
   */
  @Property(label = "Double Param")
  double doubleParam();

  /**
   * @return Integer array parameter
   */
  @Property(label = "Integer Array Param")
  int[] intArrayParam();

}
