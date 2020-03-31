package com.nick.wood.rigid_body_dynamics.rigid_body_dynamics_verbose;

import com.nick.wood.rigid_body_dynamics.maths.Vec3d;

public class CollisionReturnVariable {
	private final Vec3d linearVelocity;
	private final Vec3d angularVelocity;
	private final Vec3d positionDisplacement;

	public CollisionReturnVariable(Vec3d linearVelocity, Vec3d angularVelocity, Vec3d positionDisplacement) {
		this.linearVelocity = linearVelocity;
		this.angularVelocity = angularVelocity;
		this.positionDisplacement = positionDisplacement;
	}

	public Vec3d getLinearVelocity() {
		return linearVelocity;
	}

	public Vec3d getAngularVelocity() {
		return angularVelocity;
	}

	public Vec3d getPositionDisplacement() {
		return positionDisplacement;
	}
}
