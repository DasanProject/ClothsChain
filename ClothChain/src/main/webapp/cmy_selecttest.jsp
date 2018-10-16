<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-10-15
  Time: 8:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .class1{
            background: #444;
            color: #eee;
        }
        .active {
            width: 100px;
            height: 100px;
            background: green;
        }
        .text-danger {
            background: red;
        }
    </style>
</head>
<body>
<%--   页数：<input id="pageNum"><br/>
   每页显示条数：<input id="pageSize"/><br/>
     <input type="button" id="btntest" value="分页查询">--%>

<%--vue练习1--%>
<%--   <div id="app">
       <p>{{message}}</p>

   </div>--%>
<%--vue练习2--%>
<div id="vue_det">
    <h1>site : {{site}}</h1>
    <h1>url : {{url}}</h1>
    <h1>{{details()}}</h1>
</div>
<%--vue练习3--%>
<div id="app">
    <div v-html="message"></div>
</div>
<%--vue练习4--%>
<div id="app">
    <label>修改颜色</label><input type="checkbox" v-model="class1" id="r1">
    <br><br>
    <div v-bind:class="{'class1': class1}">
        v-bind:class 指令
    </div>
</div>
<!---练习5-->
<div id="app">
	{{5+5}}<br>
	{{ ok ? 'YES' : 'NO' }}<br>
	{{ message.split('').reverse().join('') }}
	<div v-bind:id="'list-' + id">菜鸟教程</div>
</div>

6
<div id="app">
    <p v-if="seen">现在你看到我了</p>
    <template v-if="ok">
        <h1>菜鸟教程</h1>
        <p>学的不仅是技术，更是梦想！</p>
        <p>哈哈哈，打字辛苦啊！！！</p>
    </template>
</div>
7
<div id="app">
    <pre><a v-bind:href="url">菜鸟教程</a></pre>
</div>
8
<div id="app">
    <p>{{ message }}</p>
    <button v-on:click="reverseMessage">反转字符串</button>
</div>
9
<div id="app">
    {{ message | capitalize }}
</div>
10
<div id="app">
    <div v-if="Math.random() > 0.5">
        Sorry
    </div>
    <div v-else>
        Not sorry
    </div>
</div>
11
<div id="app">
    <ol>
        <li v-for="site in sites">
            {{ site.name }}
        </li>
    </ol>
</div>

12
<div id="app">
<ul>
    <template v-for="site in sites">
        <li>{{ site.name }}</li>
        <li>--------------</li>
    </template>
</ul>
</div>
13
<div id="app">
    <ul>
        <li v-for="value in object">
            {{ value }}
        </li>
    </ul>
</div>
14
<div id="app">
    <ul>
        <li v-for="(value, key) in object">
            {{ key }} : {{ value }}
        </li>
    </ul>
</div>
15
<div id="app">
    <ul>
        <li v-for="(value, key, index) in object">
            {{ index }}. {{ key }} : {{ value }}
        </li>
    </ul>
</div>
16
<div id="app">
    <ul>
        <li v-for="(value,key,index) in object">
            <p v-if="typeof value!='object'">{{value}}  {{index}}</p>
            <p v-else>
                {{value}}   {{index}}
            </p>
            <ul  v-if="typeof value=='object'">
                <li v-for="(value,key,index) in value">
                    {{value}}   {{index}}
                </li>
            </ul>
        </li>
    </ul>
</div>
17
<div id="app">
    <div v-for="n in 9">
        <b v-for="m in n">
            {{m}} * {{n}} ={{m*n}}
        </b>
    </div>
</div>
18
<div id="app">
    计算属性之前：<input :value="message" v-model="message">{{message}}<br/>
    使用computed: 计算属性之后：{{aftercompomed}}<br/>
    使用methods  计算属性之后：{{aftermethods()}}
</div>
19
<div id="app">
    <p>{{ site }}</p>
</div>
20
<div id = "app">
    <p style = "font-size:25px;">计数器: {{ counter }}</p>
    <button @click = "counter++" style = "font-size:25px;">点我</button>
</div>
21
<div id = "computed_props">
    千米 : <input type = "text" v-model = "kilometers">
    米 : <input type = "text" v-model = "meters">
</div>
<p id="info"></p>
22
<div id="app">
    <div v-bind:class="{ active: isActive }"></div>
</div>
23
<div id="app">
    <div v-bind:class="classObject"></div>
</div>
24
<div id="app">
    <div v-bind:class="classObject"></div>
</div>
25
<div id="app">
    <!-- `greet` 是在下面定义的方法名 -->
    <button v-on:click="greet">Greet</button>
</div>
26
<div id="app">
    <button v-on:click="say('hi')">Say hi</button>
    <button v-on:click="say('what')">Say what</button>
</div>
27
<div id="app">
    <p>input 元素：</p>
    <input v-model="message" placeholder="编辑我……">
    <p>消息是: {{ message }}</p>

    <p>textarea 元素：</p>
    <p style="white-space: pre">{{ message2 }}</p>
    <textarea v-model="message2" placeholder="多行文本输入……"></textarea>
</div>
​28
<div id="app">
    <p>单个复选框：</p>
    <input type="checkbox" id="checkbox" v-model="checked">
    <label for="checkbox">{{ checked }}</label>

    <p>多个复选框：</p>
    <input type="checkbox" id="runoob" value="Runoob" v-model="checkedNames">
    <label for="runoob">Runoob</label>
    <input type="checkbox" id="google" value="Google" v-model="checkedNames">
    <label for="google">Google</label>
    <input type="checkbox" id="taobao" value="Taobao" v-model="checkedNames">
    <label for="taobao">taobao</label>
    <br>
    <span>选择的值为: {{ checkedNames }}</span>
</div>
29
<div id="app">
    <p>
        全选：
    </p>
    <input type="checkbox" id="checkbox" v-model="checked" @change="changeAllChecked()">
    <label for="checkbox">
        {{checked}}
    </label>
    <p>
        多个复选框：
    </p>
    <input type="checkbox" id="runoob" value="Runoob" v-model="checkedNames">
    <label for="runoob">
        Runoob
    </label>
    <input type="checkbox" id="google" value="Google" v-model="checkedNames">
    <label for="google">
        Google
    </label>
    <input type="checkbox" id="taobao" value="Taobao" v-model="checkedNames">
    <label for="taobao">
        taobao
    </label>
    <br>
    <span>
		选择的值为:{{checkedNames}}
	</span>
</div>
30
<div id = "databinding"></div>
</body>
</html>
<script src="vendors/jquery/dist/jquery.min.js"></script>
<script src="js/vue.js"></script>
<script src="js/vue-resource.js"></script>



    <script type="text/javascript">
        30
        var vm = new Vue({
            el: '#databinding',
            data: {
            },
            methods : {
            },
        });
        // 定义一个混入对象
        var myMixin = {
            created: function () {
                this.startmixin()
            },
            methods: {
                startmixin: function () {
                    document.write("欢迎来到混入实例");
                }
            }
        };
        var Component = Vue.extend({
            mixins: [myMixin]
        })
        var component = new Component();
        29
        new Vue({
            el: '#app',
            data: {
                checked: false,
                checkedNames: [],
                checkedArr: ["Runoob", "Taobao", "Google"]
            },
            methods: {
                changeAllChecked: function() {
                    if (this.checked) {
                        this.checkedNames = this.checkedArr
                    } else {
                        this.checkedNames = []
                    }
                }
            },
            watch: {
                "checkedNames": function() {
                    if (this.checkedNames.length == this.checkedArr.length) {
                        this.checked = true
                    } else {
                        this.checked = false
                    }
                }
            }
        })

        28
        new Vue({
            el: '#app',
            data: {
                checked : false,
                checkedNames: []
            }
        })
        27
        new Vue({
            el: '#app',
            data: {
                message: 'Runoob',
                message2: '菜鸟教程\r\nhttp://www.runoob.com'
            }
        })
        26
        new Vue({
            el: '#app',
            methods: {
                say: function (message) {
                    alert(message)
                }
            }
        })
        25
        var app = new Vue({
            el: '#app',
            data: {
                name: 'Vue.js'
            },
            // 在 `methods` 对象中定义方法
            methods: {
                greet: function (event) {
                    // `this` 在方法里指当前 Vue 实例
                    alert('Hello ' + this.name + '!')
                    // `event` 是原生 DOM 事件
                    if (event) {
                        alert(event.target.tagName)
                    }
                }
            }
        })
        // 也可以用 JavaScript 直接调用方法
        app.greet() // -> 'Hello Vue.js!'
        24
        new Vue({
            el: '#app',
            data: {
                isActive: true,
                error: null
            },
            computed: {
                classObject: function () {
                    return {
                        active: this.isActive && !this.error,
                        'text-danger': this.error && this.error.type === 'fatal',
                    }
                }
            }
        })
        23
        new Vue({
            el: '#app',
            data: {
                classObject: {
                    active: true,
                    'text-danger': true
                }
            }
        })
        22
        new Vue({
            el: '#app',
            data: {
                isActive: true
            }
        })
        21
        var vm = new Vue({
            el: '#computed_props',
            data: {
                kilometers : 0,
                meters:0
            },
            methods: {
            },
            computed :{
            },
            watch : {
                kilometers:function(val) {
                    this.kilometers = val;
                    this.meters = val * 1000;
                },
                meters : function (val) {
                    this.kilometers = val/ 1000;
                    this.meters = val;
                }
            }
        });
        // $watch 是一个实例方法
        vm.$watch('kilometers', function (newValue, oldValue) {
            // 这个回调将在 vm.kilometers 改变后调用
            document.getElementById ("info").innerHTML = "修改前值为: " + oldValue + "，修改后值为: " + newValue;
        })
        20
        var vm = new Vue({
            el: '#app',
            data: {
                counter: 1
            }
        });
        vm.$watch('counter', function(nval, oval) {
            alert('计数器值的变化 :' + oval + ' 变为 ' + nval + '!');
        });
    </script>
        19
        var vm = new Vue({
            el: '#app',
            data: {
                name: 'Google',
                url: 'http://www.google.com'
            },
            computed: {
                site: {
                    // getter
                    get: function () {
                        return this.name + ' ' + this.url
                    },
                    // setter
                    set: function (newValue) {
                        var names = newValue.split(' ')
                        this.name = names[0]
                        this.url = names[names.length - 1]
                    }
                }
            }
        })
        // 调用 setter， vm.name 和 vm.url 也会被对应更新
        vm.site = '菜鸟教程 http://www.runoob.com';
        document.write('name: ' + vm.name);
        document.write('<br>');
        document.write('url: ' + vm.url);
        18
        new Vue({
            el:"#app",
            data:{
                message:"cmy"

            },
            computed:{
                //计算属性的getter
                aftercompomed: function(){
                    return this.message.split('').reverse().join('')

                }

            },
            methods:{
                aftermethods:function(){
                    return this.message.split('').reverse().join('')
                }

            }

        })
        17
        new Vue({
            el:"#app"
        })
        16
        new Vue({
            el:"#app",
            data:{
                object:{
                    name:"cmy",
                    age:21,
                    url:"com.aaa.cmy",
                    object2:{
                        a:"haha",
                        b:"enen",
                        c:"shasha"

                    }

                }



            }

        })
        15
        new Vue({
            el: '#app',
            data: {
                object: {
                    name: '菜鸟教程',
                    url: 'http://www.runoob.com',
                    slogan: '学的不仅是技术，更是梦想！'
                }
            }
        })
        14
        new Vue({
            el: '#app',
            data: {
                object: {
                    name: '菜鸟教程',
                    url: 'http://www.runoob.com',
                    slogan: '学的不仅是技术，更是梦想！'
                }
            }
        })
        13
        new Vue({
            el: '#app',
            data: {
                object: {
                    name: '菜鸟教程',
                    url: 'http://www.runoob.com',
                    slogan: '学的不仅是技术，更是梦想！'
                }
            }
        })
        12
        new Vue({
            el: '#app',
            data: {
                sites: [
                    { name: 'Runoob' },
                    { name: 'Google' },
                    { name: 'Taobao' }
                ]
            }
        })
        11
        new Vue({
            el: '#app',
            data: {
                sites: [
                    { name: 'Runoob' },
                    { name: 'Google' },
                    { name: 'Taobao' }
                ]
            }
        })
        10
        new Vue({
            el: '#app'
        })
        9
        new Vue({
            el: '#app',
            data: {
                message: 'runoob'
            },
            filters: {
                capitalize: function (value) {
                    if (!value) return ''
                    value = value.toString()
                    return value.charAt(0).toUpperCase() + value.slice(1)
                }
            }
        })
        8
        new Vue({
            el: '#app',
            data: {
                message: 'Runoob!'
            },
            methods: {
                reverseMessage: function () {
                    this.message = this.message.split('').reverse().join('')
                }
            }
        })
        7
        new Vue({
            el: '#app',
            data: {
                url: 'http://www.runoob.com'
            }
        })
        <%---练习6--%>
        new Vue({
            el: '#app',
            data: {
                seen: true,
                ok: true
            }
        })

        <%---练习5--%>
        new Vue({
  el: '#app',
  data: {
	ok: true,
    message: 'RUNOOB',
	id : 1
  }
})
        <%--vue练习4--%>
        new Vue({
            el: '#app',
            data:{
                class1: false
            }
        });
        <%--vue练习3--%>
        new Vue({
            el: '#app',
            data: {
                message: '<h1>你是个小可爱吗？</h1>'
            }
        })

        <%--vue练习2--%>
    var vm = new Vue({
        el: '#vue_det',
        data: {
            site: "菜鸟教程",
            url: "www.runoob.com",
            alexa: "10000"
        },
        methods: {
            details: function() {
                return  this.site + " - 学的不仅是技术，更是梦想！";
            }
        }
    })

   /* new Vue({
        el:"#app",
        data:{
            message:"你好，vue"
        }
    })*/
  /*  $("#btntest").click(function () {

        $.ajax({
            url:"aaa/getAdmissionAll_cmy",
            data:{"pageNum":$("#pageNum").val(),"pageSize":$("#pageSize").val()},
            dataType:"json",
            success:function (data) {
                for (var i=0;i<data.list.length;i++){
                    alert(data.list[i].admissionmoney);
                }
            }
        })

    });

    new Vue({
        created: function () {
            //post请求
            this.$http.jsonp('aaa/getAdmissionAll_cmy',
                {params:{
                   pageNum:1,
                    pageSize:3
                },
                    dataType:"json",

            }).then(function(response){
                alert("success");
            },function (response) {

                alert(response);
            });
        }
    });*/
</script>