package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkBaseConfig;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import static frc.robot.Constants.*;

public class DriveTrain extends SubsystemBase{
    private DifferentialDrive driveDifferential;
    private SparkMax leftLeader;
    private SparkMax leftFollower;
    private SparkMax rightLeader;
    private SparkMax rightFollower;
    

    // TODO: Initialie the motors. Note: DeviceID is also referred to as CANId. They are defined in the Constants file.
    // TODO: Configure leftFollower to follow leftLeader and rightFollower to follow rightLeader. See example
    // https://github.com/Team2667/Reefscape/blob/main/src/main/java/frc/robot/subsystems/Elevator.java
    // TODO: Initialie driveDifferential with the left and right leader motors.

    public DriveTrain() {
    }

    
    public void drive(double leftSpeed, double rightSpeed) {
        // TODO: call the tankDrive method of driveDifferential.
    }

}
