/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thevoxelbox.voxelsniper.brush.perform;

import com.thevoxelbox.voxelsniper.Message;

import org.bukkit.block.Block;

/**
 * @author Voxel
 */
public class pComboNoPhys extends vPerformer
{

    private int i;
    private byte d;

    public pComboNoPhys()
    {
        name = "Combo NoPhysics";
    }

    @Override
    public void info(Message vm)
    {
        vm.performerName(name);
        vm.voxel();
        vm.data();
    }

    @Override
    public void init(com.thevoxelbox.voxelsniper.SnipeData v)
    {
        w = v.getWorld();
        i = v.getVoxelId();
        d = v.getData();
    }

    @SuppressWarnings("deprecation")
	@Override
    public void perform(Block b)
    {
        h.put(b);
        b.setTypeIdAndData(i, d, false);
    }
}
