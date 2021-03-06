package me.limeglass.skungee.bungeecord.handlers.bungeetablistplus;

import java.net.InetAddress;

import codecrafter47.bungeetablistplus.api.bungee.BungeeTabListPlusAPI;
import codecrafter47.bungeetablistplus.api.bungee.CustomTablist;
import me.limeglass.skungee.bungeecord.handlercontroller.SkungeeBungeeHandler;
import me.limeglass.skungee.objects.packets.SkungeePacket;
import me.limeglass.skungee.objects.packets.SkungeePacketType;

public class TablistHandler extends SkungeeBungeeHandler {

	public TablistHandler() {
		super(SkungeePacketType.BTLP_TABLIST);
	}

	@Override
	public Object handlePacket(SkungeePacket packet, InetAddress address) {
		CustomTablist tablist = BungeeTabListPlusAPI.createCustomTablist();
		Object size = packet.getObject();
		if (size != null)
			tablist.setSize((int) size);
		else
			tablist.setSize(80);
		return new CustomTablist[] {tablist};
	}

}
