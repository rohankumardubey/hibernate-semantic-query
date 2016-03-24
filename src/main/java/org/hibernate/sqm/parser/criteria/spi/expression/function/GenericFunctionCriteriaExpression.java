/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: Apache License, Version 2.0
 * See the LICENSE file in the root directory or visit http://www.apache.org/licenses/LICENSE-2.0
 */
package org.hibernate.sqm.parser.criteria.spi.expression.function;

import java.util.List;

import org.hibernate.sqm.parser.criteria.spi.expression.CriteriaExpression;

/**
 * @author Steve Ebersole
 */
public interface GenericFunctionCriteriaExpression<T> extends FunctionCriteriaExpression<T> {
	List<CriteriaExpression<?>> getArguments();
}
