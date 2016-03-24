/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: Apache License, Version 2.0
 * See the LICENSE file in the root directory or visit http://www.apache.org/licenses/LICENSE-2.0
 */
package org.hibernate.sqm.query.expression.function;

import org.hibernate.sqm.SemanticQueryWalker;
import org.hibernate.sqm.domain.BasicType;
import org.hibernate.sqm.query.expression.Expression;

/**
 * @author Steve Ebersole
 */
public class CastFunctionExpression extends AbstractFunctionExpression implements FunctionExpression {
	public static final String NAME = "cast";

	private final Expression expressionToCast;

	public CastFunctionExpression(Expression expressionToCast, BasicType castTargetType) {
		super( castTargetType );
		this.expressionToCast = expressionToCast;
	}

	@Override
	public String getFunctionName() {
		return NAME;
	}

	@Override
	public boolean hasArguments() {
		return true;
	}

	public Expression getExpressionToCast() {
		return expressionToCast;
	}

	@Override
	public <T> T accept(SemanticQueryWalker<T> walker) {
		return walker.visitCastFunction( this );
	}
}
