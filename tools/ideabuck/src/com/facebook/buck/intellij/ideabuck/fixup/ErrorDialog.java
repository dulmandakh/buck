/*
 * Copyright 2017-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.intellij.ideabuck.fixup;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

class ErrorDialog {
  private ErrorDialog() {}

  static void showErrorDialog(
      Project project, String title, String messagePattern, Object... parameters) {
    Messages.showErrorDialog(project, String.format(messagePattern, parameters), title);
  }
}