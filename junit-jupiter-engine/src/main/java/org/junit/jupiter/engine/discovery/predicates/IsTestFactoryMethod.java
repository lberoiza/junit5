/*
 * Copyright 2015-2017 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.junit.jupiter.engine.discovery.predicates;

import static org.junit.platform.commons.meta.API.Usage.Internal;

import org.junit.jupiter.api.TestFactory;
import org.junit.platform.commons.meta.API;

/**
 * Test if a method is a JUnit Jupiter {@link TestFactory @TestFactory} method.
 *
 * <p>NOTE: this predicate does <strong>not</strong> check if a candidate method
 * has an appropriate return type for a {@code @TestFactory} method.
 *
 * @since 5.0
 */
@API(Internal)
public class IsTestFactoryMethod extends IsTestableMethod {

	public IsTestFactoryMethod() {
		super(TestFactory.class, false);
	}

}
