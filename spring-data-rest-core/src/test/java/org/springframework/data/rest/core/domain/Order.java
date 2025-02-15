/*
 * Copyright 2013-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.rest.core.domain;

import lombok.Value;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;

/**
 * @author Oliver Gierke
 */
@Value
class Order {

	@Id UUID id = UUID.randomUUID();
	@Reference Person creator;
}
