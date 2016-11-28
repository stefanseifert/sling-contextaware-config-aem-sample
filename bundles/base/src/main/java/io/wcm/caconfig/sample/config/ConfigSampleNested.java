/* Copyright (c) pro!vision GmbH. All rights reserved. */
package io.wcm.caconfig.sample.config;

import org.apache.sling.caconfig.annotation.Configuration;
import org.apache.sling.caconfig.annotation.Property;

/**
 * Nested config annotation class example
 */
@Configuration(label = "Sample Configuration Nested", description = "This is another sample configuration that is nested.")
public @interface ConfigSampleNested {

  /**
   * @return String parameter
   */
  @Property(label = "String Param", description = "This is a string parameter in the singleton configuration.")
  String stringParam();

  /**
   * @return Sub Config
   */
  @Property(label = "Sub Config", description = "Nested configuration")
  ConfigSampleSub[] sub();

  /**
   * @return Sub Config 2
   */
  @Property(label = "Sub Config 2", description = "Another nested configuration")
  ConfigSampleSub2 sub2();

}
