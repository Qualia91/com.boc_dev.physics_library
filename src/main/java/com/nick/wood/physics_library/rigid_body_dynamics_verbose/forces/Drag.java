package com.nick.wood.physics_library.rigid_body_dynamics_verbose.forces;

import com.nick.wood.maths.objects.vector.Vec3d;
import com.nick.wood.physics_library.rigid_body_dynamics_verbose.RigidBody;

public class Drag implements Force{

	private final double dragCoeff;

	public Drag(double dragCoeff) {
		this.dragCoeff = dragCoeff;
	}

	@Override
	public Vec3d actLinear(RigidBody rigidBody) {
		return rigidBody.getVelocity().scale(dragCoeff);
	}

	@Override
	public Vec3d actAngular(RigidBody rigidBody) {
		return rigidBody.getAngularVelocity().scale(dragCoeff);
	}
}