package param;

import org.aspectj.lang.ProceedingJoinPoint;

public class ParamAspect {
        public void before(int x,int y){
            System.out.println("before = "+ x);
            System.out.println("before = " + y);
        }

        public void before2(int x,int y){
            System.out.println("222 x=" + x);
            System.out.println("222 y=" +y);
        }

        public Object aroundParam(ProceedingJoinPoint joinPoint){
            Object result = null;
            try {
                result = joinPoint.proceed();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
            Object[] args = joinPoint.getArgs();
            for (int i=0 ; i<args.length; i++){
                System.out.println("i = " + args[i]);
            }
            return result;
        }
}
