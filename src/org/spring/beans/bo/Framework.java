package org.spring.beans.bo;

public class Framework {
    Long id;
    String name;
    String type;
    String creator;

    public Framework() {
        System.out.println("开始创建对象："+Framework.class.getName());
    }

    public Long getId() throws Exception {
        System.out.println("获取id：");

        if(id==1L){
            throw new Exception("test");
        }

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        return "Framework{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", creator='" + creator + '\'' +
                '}';
    }
}
