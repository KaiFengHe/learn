package com.roncoo.eshop.inventory.thread;

import com.roncoo.eshop.inventory.request.Request;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;

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
public class RequestProcessorThread implements Callable<Boolean> {
    private ArrayBlockingQueue<Request> queue;

    @Override
    public Boolean call() throws Exception {
        while (true) {
            break;
        }
        return true;
    }

    public RequestProcessorThread(ArrayBlockingQueue<Request> queue) {
        this.queue = queue;
    }
}
