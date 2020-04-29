package com.nick.wood.rigid_body_dynamics.rigid_body_dynamics_verbose.forces;

import com.nick.wood.maths.objects.vector.Vec3d;
import com.nick.wood.rigid_body_dynamics.rigid_body_dynamics_verbose.RigidBody;

public interface Force {


	Vec3d actLinear(RigidBody rigidBody);
	Vec3d actAngular(RigidBody rigidBody);
}
