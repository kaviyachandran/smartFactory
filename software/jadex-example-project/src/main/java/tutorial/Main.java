package tutorial;

import jadex.base.PlatformConfiguration;
import jadex.base.Starter;

public class Main
{
	public static void main(String[] args)
	{
		PlatformConfiguration configuration = PlatformConfiguration.getDefaultNoGui();
		configuration.addComponent("tutorial.HelloAgent.class");
		Starter.createPlatform(configuration).get();
	}
}
