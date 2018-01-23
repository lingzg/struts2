package interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class FirstInterceptor implements Interceptor {

	@Override
	public void destroy() {

	}

	@Override
	public void init() {

	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		System.out.println("FirstInterceptor拦截前...");
		ai.invoke();
		System.out.println("FirstInterceptor拦截后...");
		return "error";
	}

}
