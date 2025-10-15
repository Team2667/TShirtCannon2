package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.DriveTrain;

public class Drive extends Command {
    private DriveTrain driveTrain;
    private CommandXboxController controller;



    public Drive(DriveTrain driveTrain, CommandXboxController controller) {

        //TODO: Initialize the variables. Use addRequirements() to declare subsystem dependencies.
       
    }

    public void execute() {
        
        // Call the drive method of the driveTrain subsystem and pass in the values from leftSpeed and rightSpeed 
        // controller.
    }
}
