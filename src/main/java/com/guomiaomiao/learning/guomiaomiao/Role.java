package com.guomiaomiao.learning.guomiaomiao;

/**
 * Created by 15295 on 2018/5/14.
 */
public class Role {
    private Long id;
    private String roleName;
    private String note;

    public void setId(Long id) {
        this.id = id;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
