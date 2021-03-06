/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.servicecomb.it.schema;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestSchema(schemaId = "ignoreStaticMethodSpringmvcSchema")
@RequestMapping(path = "/ignoreStaticMethodSpringmvcSchema")
public class IgnoreStaticMethodSpringmvcSchema {

  private IgnoreStaticMethodSpringmvcSchema() {
  }

  private static IgnoreStaticMethodSpringmvcSchema INSTANCE = new IgnoreStaticMethodSpringmvcSchema();

  public static IgnoreStaticMethodSpringmvcSchema getINSTANCE() {
    return INSTANCE;
  }

  @GetMapping("staticSub")
  public static int staticSub(int num1, int num2) {
    return num1 - num2;
  }

  @GetMapping("add")
  public int add(int num1, int num2) {
    return num1 + num2;
  }
}
