package com.entity.spring01;

import com.entity.spring02.Animal;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @autor : WL;
 * @date : 2019/6/26 0026
 */
public class Bean {
    private List<String> data;
    private List<Animal> data2;
    private List<String> addr;
    private Set<String> love;
    private Map<String,String> address;

    public List<String> getAddr() {
        return addr;
    }

    public void setAddr(List<String> addr) {
        this.addr = addr;
    }

    public Set<String> getLove() {
        return love;
    }

    public void setLove(Set<String> love) {
        this.love = love;
    }

    public Map<String, String> getAddress() {
        return address;
    }

    public void setAddress(Map<String, String> address) {
        this.address = address;
    }

    public List<Animal> getData2() {
        return data2;
    }

    public void setData2(List<Animal> data2) {
        this.data2 = data2;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }
}
