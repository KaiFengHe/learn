package com.roncoo.eshop.inventory.request;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * <li>文件名称: 请求内存队列</li>
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
public class RequestQueue {
    private List<ArrayBlockingQueue> arrayBlockingQueueList = new ArrayList<>();

    public void add(ArrayBlockingQueue<Request> arrayBlockingQueue) {
        arrayBlockingQueueList.add(arrayBlockingQueue);
    }

    private static class Singleton {
        private static RequestQueue instance;

        static {
            instance = new RequestQueue();
        }

        public static RequestQueue getInstance() {
            return instance;
        }
    }

    public static RequestQueue getInstance() {
        return Singleton.getInstance();
    }
}
