package networkManager;
import java.io.*;
import java.net.*;

public class NetworkManager {
	private Socket socket;
	private DataInputStream input;
	private DataOutputStream out;
	private CookieHandler cookieHandler;
	private Proxy proxySettings;
	private URL url;
	private URLConnection urlConnection;
	
	public NetworkManager(Socket socket, DataInputStream input, DataOutputStream out, CookieHandler cookieHandler,
			Proxy proxySettings, URL url, URLConnection urlConnection) {
		super();
		this.socket = socket;
		this.input = input;
		this.out = out;
		this.cookieHandler = cookieHandler;
		this.proxySettings = proxySettings;
		this.url = url;
		this.urlConnection = urlConnection;
	}

	public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}

	public DataInputStream getInput() {
		return input;
	}

	public void setInput(DataInputStream input) {
		this.input = input;
	}

	public DataOutputStream getOut() {
		return out;
	}

	public void setOut(DataOutputStream out) {
		this.out = out;
	}

	public CookieHandler getCookieHandler() {
		return cookieHandler;
	}

	public void setCookieHandler(CookieHandler cookieHandler) {
		this.cookieHandler = cookieHandler;
	}

	public Proxy getProxySettings() {
		return proxySettings;
	}

	public void setProxySettings(Proxy proxySettings) {
		this.proxySettings = proxySettings;
	}

	public URL getUrl() {
		return url;
	}

	public void setUrl(URL url) {
		this.url = url;
	}

	public URLConnection getUrlConnection() {
		return urlConnection;
	}

	public void setUrlConnection(URLConnection urlConnection) {
		this.urlConnection = urlConnection;
	}

	@Override
	public String toString() {
		return "NetworkManager [socket=" + socket + ", input=" + input + ", out=" + out + ", cookieHandler="
				+ cookieHandler + ", proxySettings=" + proxySettings + ", url=" + url + ", urlConnection="
				+ urlConnection + ", getSocket()=" + getSocket() + ", getInput()=" + getInput() + ", getOut()="
				+ getOut() + ", getCookieHandler()=" + getCookieHandler() + ", getProxySettings()=" + getProxySettings()
				+ ", getUrl()=" + getUrl() + ", getUrlConnection()=" + getUrlConnection() + "]";
	}
}
