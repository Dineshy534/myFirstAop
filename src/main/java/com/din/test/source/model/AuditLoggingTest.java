package com.din.test.source.model;

import com.din.test.source.EnableAuditLogging;

public class AuditLoggingTest {
	
	private Circle circle;
	
	private Triangle triangle;

	public Circle getCircle() {
		return circle;
	}
	@EnableAuditLogging
	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public Triangle getTriangle() {
		return triangle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}

}
