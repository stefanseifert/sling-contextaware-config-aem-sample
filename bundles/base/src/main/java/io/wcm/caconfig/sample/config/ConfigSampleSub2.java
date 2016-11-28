/* Copyright (c) pro!vision GmbH. All rights reserved. */
package io.wcm.caconfig.sample.config;

import org.apache.sling.caconfig.annotation.Property;

/**
 * Nested sub config 2.
 */
public @interface ConfigSampleSub2 {

  /**
   * @return String parameter
   */
  @Property(label = "Sub 2 String Param", description = "This is a string parameter in the ConfigSampleSub2 configuration.")
  String sub2StringParam();

  /**
   * @return Sub Config
   */
  @Property(label = "Sub Config", description = "Nested configuration")
  ConfigSampleSub sub();

}
