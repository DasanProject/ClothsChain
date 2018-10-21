<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-10-20
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-1.10.2.min.js"></script>
    <script src="js/vue.js"></script>
    <script src="js/vue.js"></script>
</head>
<body>
<div id="app">
    <button class="btn btn-primary btn-sm addBox" @click="addBox">添加</button>
    <button class="btn btn-sm btn-danger delAll" @click="delAll">批量删除</button>
    <table class="table table-bordered" >
        <thead>
        <tr>
            <td><input type="checkbox" @click="allSelect"  v-model="checked"></td>
            <td>学号</td>
            <td>姓名</td>
            <td>年纪</td>
            <td>操作</td>

        </tr>
        </thead>
        <tbody>
        <tr v-for="person,index in people">
            <td><input type="checkbox" v-model="selected"  v-bind:value="person.sid"></td>
            <td @click="edit(index)" contenteditable="true">{{person.sid}}</td>
            <td @click="edit(index)" contenteditable="true">{{person.sname}}</td>
            <td @click="edit(index)" contenteditable="true">{{person.sage}}</td>
            <td><button @click="del(index)" class="btn btn-danger btn-sm">删除</button><button @click="update(index)" class="btn btn-info btn-sm">编辑</button></td>
        </tr>
        </tbody>

    </table>

    <fieldset v-show="seen" >
        <legend>新增用户</legend>
        <div class="">
            <p>
                <label>学号：</label>
                <input type="text" v-model="newPeople.sid">
            </p>
            <p>
                <label>姓名：</label>
                <input type="text" v-model="newPeople.sname">
            </p>
            <p>
                <label>年龄：</label>
                <input type="number" v-model="newPeople.sage">
            </p>
            <p>
                <button class="btn btn-success btn-sm submit" @click="add">提交</button>
            </p>
        </div>


    </fieldset>
    <!-- 编辑界面 -->
    <fieldset v-show="editSeen">
        <legend>编辑用户</legend>


        <div class="">
            <p>
                <label>学号：</label>
                <input type="text" v-model="editPeople.sid" value="{{sid}}">
            </p>
            <p>
                <label>姓名：</label>
                <input type="text" v-model="editPeople.sname" value="{{sname}}">
            </p>
            <p>
                <label>年龄：</label>
                <input type="number" v-model="editPeople.sage" value="{{sage}}">
            </p>
            <p>
                <button class="btn btn-success btn-sm submit" @click="editSubmit">提交</button>
            </p>
        </div>
    </fieldset>
</div>


<script type="text/javascript" src="vue.min.js"></script>
<script type="text/javascript">
    var data ={
        people:[
            {'sid':'1043','sname':'张三','sage':18},
            {'sid':'2434','sname':'赵六','sage':43},
            {'sid':'3424','sname':'李四','sage':42},
            {'sid':'1231','sname':'王五','sage':35}
        ],
        newPeople:{
            'sid':'','sname':'','sage':''
        },
        seen:false,
        editSeen:false,
        checked:false,
        selected:[],
        editPeople:{
            'sid':'','sname':'','sage':''
        }

    } ;
    var app = new Vue({
        'el':'#app',
        data:data,

        methods:{
            // 添加
            addBox:function(){
                this.seen = this.seen == false ? true : false;
            },
            //删除
            del:function(index){
                console.log(11);
                this.people.splice(index,1);
            },
            //提交
            add:function(){
                //插入到people中
                this.people.push(this.newPeople);

                this.newPeople = {};
                this.seen = false
            },
            //全选
            allSelect:function(){
                if(this.selected.length != this.people.length){
                    this.selected = [];
                    for(var i = 0; i<this.people.length;i++){
                        this.selected.push(this.people[i].sid);
                        console.log(this.people[i].sid);

                    }

                }else{
                    this.selected = [];
                }

            },
            //批量删除
            delAll:function(){
                for(var j = 0; j< this.selected.length;j++){
                    for(var i = 0; i< this.people.length; i++){
                        if(this.selected[j] == this.people[i].sid){
                            this.people.splice(i,1);
                        }
                    }
                }

            },
            //编辑
            update:function(index){
                this.editSeen = true;
                this.editPeople = this.people[index];



            },
            //编辑后提交
            editSubmit:function(){
                this.editSeen = false;

            }

        },
        watch:{
            "selected":function(){
                if(this.selected.length == this.people.length){
                    this.checked = true;
                }else{
                    this.checked = false;
                }
            }
        }
    })
</script>
</body>
</html>