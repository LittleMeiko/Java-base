package com.atguigu.java;

/*
 * interface接口的运用：
 * 	设计模式-Proxy(代理模式)：为其它对象提供一种代理以控制对这个对象的访问
 * 	
 */
public class ProxyPatternTest {
	
	public static void main(String[] args) {
		ProxyServer proxyServer = new ProxyServer(new Server());
		proxyServer.browse();
	}
}

interface NetWork {
	
	public void browse();
}

/*
 * 	被代理类
 */
class Server implements NetWork {

	@Override
	public void browse() {
		System.out.println("真实的服务器访问网络...");
	}
}

/*
 * 	代理类
 */
class ProxyServer implements NetWork {
	
	private NetWork netWork;
	
	public ProxyServer(NetWork netWork) {
		this.netWork = netWork;
	}
	
	private void check() {
		System.out.println("联网之前进行检查...");
	}
	
	@Override
	public void browse() {
		check();
		netWork.browse();
	}
}
