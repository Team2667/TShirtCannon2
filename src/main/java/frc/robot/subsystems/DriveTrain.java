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
    private SparkMax leftMotor;
    private SparkMax RightMotor;
    



    public DriveTrain() {
        leftMotor=new SparkMax(leftCANId, MotorType.kBrushless);
        RightMotor=new SparkMax(rightCANId, MotorType.kBrushless);
        driveDifferential=new DifferentialDrive(leftMotor, RightMotor);
    }

    
    public void drive(double leftSpeed, double rightSpeed) {
        // TODO: call the tankDrive method of driveDifferential.
        driveDifferential.tankDrive(leftSpeed, rightSpeed);
    }

}
