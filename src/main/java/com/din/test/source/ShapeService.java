package com.din.test.source;

import com.din.test.source.model.Circle;
import com.din.test.source.model.Triangle;

public class ShapeService {
	
	private Circle circle;
	private Triangle triangle;
	public Circle getCircle() {
		return circle;
	}
	@EnableAuditLogging
	public void setCircle(@EnableAuditLogging Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}

}
