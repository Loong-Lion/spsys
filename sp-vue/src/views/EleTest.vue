<template>
    <el-container style="height: 500px; border: 1px solid #eee">
        <el-container>
            <el-header style="text-align: right; font-size: 12px">
                <el-dropdown>
                    <i class="el-icon-setting" style="margin-right: 15px"></i>
                    <el-dropdown-menu slot="dropdown">
                        <el-dropdown-item>查看</el-dropdown-item>
                        <el-dropdown-item>新增</el-dropdown-item>
                        <el-dropdown-item>删除</el-dropdown-item>
                    </el-dropdown-menu>
                </el-dropdown>
                <span>王小虎</span>
            </el-header>

            <el-main>
                <el-table :data="tableData">
                    <el-table-column prop="date" label="日期" width="140">
                    </el-table-column>
                    <el-table-column prop="name" label="姓名" width="120">
                    </el-table-column>
                    <el-table-column prop="address" label="地址">
                    </el-table-column>
                </el-table>

                <table>
                    <tr>
                        <td>所属子系统</td>
                        <td width="200px">物料名称</td>
                        <td width="200px">通号专业通用名称</td>
                        <td>物料编码</td>
                        <td>物料类型</td>
                        <td>数量</td>
                        <td>单位</td>
                        <td>存放位置</td>
                        <td>账面数量</td>
                        <td>实际数量</td>
                        <td>差异</td>
                        <td>差异说明</td>
                    </tr>
                    <tr v-for="item in SpareParts">
                        <td>{{item.subSystem}}</td>
                        <td>{{item.spName}}</td>
                        <td>{{item.specialtyName}}</td>
                        <td>{{item.spCode}}</td>
                        <td>{{item.spType}}</td>
                        <td>{{item.spNumber}}</td>
                        <td>{{item.spUnit}}</td>
                        <td>{{item.spAddr}}</td>
                        <td>{{item.spPhyCount}}</td>
                        <td>{{item.spNumber}}</td>
                        <td>{{item.spDifCount}}</td>
                        <td>{{item.spDifCause}}</td>
                    </tr>
                </table>
            </el-main>
        </el-container>
    </el-container>
</template>

<style>
    .el-header {
        background-color: #B3C0D1;
        color: #333;
        line-height: 60px;
    }
</style>

<script>
    export default {
        data() {
            return{
                SpareParts:[

                ]
            }
        },
        created() {
            const _this = this
            this.axios.get('http://localhost:8080/sparepart/findAll/').then(
                function (resp) {
                    _this.SpareParts = resp.data
                }
            )
        }
    };
</script>
