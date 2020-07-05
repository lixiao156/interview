package com.interviewone;

import java.util.Comparator;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/7/4 0:13
 */
class MapComparator implements Comparator<Integer>
{
    @Override
    public int compare(Integer o1, Integer o2)
    {
        return o1 - o2;
    }
}