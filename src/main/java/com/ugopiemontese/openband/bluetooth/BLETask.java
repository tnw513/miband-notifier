package com.ugopiemontese.openband.bluetooth;

import java.util.List;

/**
 * Created by Lewis on 04/01/15.
 */
public class BLETask
{
	private final List<BLEAction> actions;

	public BLETask(final List<BLEAction> actions)
	{
		this.actions = actions;
	}

	public List<BLEAction> getActions()
	{
		return actions;
	}
}
