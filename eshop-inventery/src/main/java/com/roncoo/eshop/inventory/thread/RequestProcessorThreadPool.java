package com.roncoo.eshop.inventory.thread;


import com.roncoo.eshop.inventory.request.Request;
import com.roncoo.eshop.inventory.request.RequestQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <li>文件名称: 题目名称</li>
 * <li>文件描述: </li>
 * <li>版权所有: 版权所有© 2005-2017</li>
 * <li>公 司: 勤智数码科技股份有限公司</li>
 * <li>内容摘要: 无</li>
 * <li>其他说明:无</li>
 * <li>完成日期： 2018/1/9/009</li>
 * <li>修改记录: 无</li>
 *
 * @author hekf
 * @version 版本号
 */
public class RequestProcessorThreadPool {
    private ExecutorService executorService = Executors.newFixedThreadPool(10);


    public RequestProcessorThreadPool() {
        RequestQueue requestQueue = RequestQueue.getInstance();
        for (int i = 0; i < 10; i++) {
            ArrayBlockingQueue<Request> arrayBlockingQueue = new ArrayBlockingQueue(100);
            requestQueue.add(arrayBlockingQueue);
            executorService.submit(new RequestProcessorThread(arrayBlockingQueue));
        }
        init();
    }

    private static class Singleton {
        private static RequestProcessorThreadPool instance;

        static {
            instance = new RequestProcessorThreadPool();
        }

        public static RequestProcessorThreadPool getInstance() {
            return instance;
        }
    }

    public static RequestProcessorThreadPool getInstance() {
        return Singleton.getInstance();
    }

    public static void init() {
        getInstance();
    }
}
