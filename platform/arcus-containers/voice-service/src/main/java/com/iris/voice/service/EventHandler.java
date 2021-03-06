/*
 * Copyright 2019 Arcus Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.iris.voice.service;

import java.util.Optional;

import com.iris.messages.MessageConstants;
import com.iris.messages.PlatformMessage;
import com.iris.messages.listener.annotation.OnMessage;
import com.iris.voice.context.VoiceContextExecutor;

class EventHandler {

   @OnMessage(types = MessageConstants.MSG_ANY_MESSAGE_TYPE)
   public void onMessage(Optional<VoiceContextExecutor> executor, PlatformMessage message) {
      executor.ifPresent(c -> c.onMessage(message)); }
}

