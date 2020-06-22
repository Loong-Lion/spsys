<template>
    <el-container style="border: 1px solid #eee">
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
                <el-table :data="spareParts" stripe="true"  height="250">
                    <el-table-column prop="subSystem" label="所属子系统" width="140"></el-table-column>
                    <el-table-column prop="spName" label="物料名称" width="120"></el-table-column>
                    <el-table-column prop="specialtyName" label="通号专业通用名称"></el-table-column>
                    <el-table-column prop="spCode" label="物料编码"></el-table-column>
                    <el-table-column prop="spType" label="物料类型"></el-table-column>
                    <el-table-column prop="spNumber" label="数量"></el-table-column>
                    <el-table-column prop="spUnit" label="单位"></el-table-column>
                    <el-table-column prop="spAddr" label="存放位置"></el-table-column>
                    <el-table-column prop="spPhyCount" label="账面数量"></el-table-column>
                    <el-table-column prop="spNumber" label="实际数量"></el-table-column>
                    <el-table-column prop="spDifCount" label="差异"></el-table-column>
                    <el-table-column prop="spDifCause" label="差异说明"></el-table-column>
                </el-table>
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
                spareParts:[]
            }
        },
        created() {
            const _this = this
            this.axios.get('http://localhost:8080/findAll/').then(
                function (resp) {
                    _this.spareParts = resp.data
                }
            )
        }
    };
</script>
