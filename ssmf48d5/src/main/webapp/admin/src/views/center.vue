<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      label-width="80px"
    >  
     <el-row>
                              <el-col :span="12">
        <el-form-item   v-if="flag=='yonghu'"  label="账号" prop="zhanghao">
          <el-input v-model="ruleForm.zhanghao" readonly              placeholder="账号" clearable></el-input>
        </el-form-item>
      </el-col>
                                          <el-col :span="12">
        <el-form-item v-if="flag=='yonghu'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
            <el-option
                v-for="(item,index) in yonghuxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='yonghu'"  label="姓名" prop="xingming">
          <el-input v-model="ruleForm.xingming"               placeholder="姓名" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='yonghu'"  label="科室" prop="keshi">
          <el-input v-model="ruleForm.keshi"               placeholder="科室" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='yonghu'"  label="职称" prop="zhicheng">
          <el-input v-model="ruleForm.zhicheng"               placeholder="职称" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='yonghu'"  label="年龄" prop="nianling">
          <el-input v-model="ruleForm.nianling"               placeholder="年龄" clearable></el-input>
        </el-form-item>
      </el-col>
                                                                                                                                    <el-col :span="12">
        <el-form-item   v-if="flag=='defaultuser'"  label="用户名" prop="username">
          <el-input v-model="ruleForm.username"               placeholder="用户名" clearable></el-input>
        </el-form-item>
      </el-col>
                                          <el-col :span="12">
        <el-form-item   v-if="flag=='defaultuser'"  label="姓名" prop="name">
          <el-input v-model="ruleForm.name"               placeholder="姓名" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='defaultuser'"  label="性别" prop="sex">
          <el-select v-model="ruleForm.sex" placeholder="请选择性别">
            <el-option
                v-for="(item,index) in defaultusersexOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='defaultuser'"  label="年龄" prop="age">
          <el-input v-model="ruleForm.age"               placeholder="年龄" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='defaultuser'"  label="电话" prop="phone">
          <el-input v-model="ruleForm.phone"               placeholder="电话" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="24">  
        <el-form-item v-if="flag=='defaultuser'" label="照片" prop="picture">
          <file-upload
          tip="点击上传照片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.picture?ruleForm.picture:''"
          @change="defaultuserpictureUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='defaultuser'"  label="邮箱" prop="email">
          <el-input v-model="ruleForm.email"               placeholder="邮箱" clearable></el-input>
        </el-form-item>
      </el-col>
                                                      <el-form-item v-if="flag=='users'" label="用户名" prop="username">
        <el-input v-model="ruleForm.username" 
        placeholder="用户名"></el-input>
      </el-form-item>
      <el-col :span="24">
      <el-form-item>
        <el-button type="primary" @click="onUpdateHandler">修 改</el-button>
      </el-form-item>
      </el-col>
      </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: '',
      usersFlag: false,
                                                      yonghuxingbieOptions: [],
                                                                                                                                                                                                                        defaultusersexOptions: [],
                                                                                                    };
  },
  mounted() {
    var table = this.$storage.get("sessionTable");
    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
                                    this.yonghuxingbieOptions = "男,女".split(',')
                                                                                                                                                this.defaultusersexOptions = "男,女".split(',')
                                                                  },
  methods: {
                                                                                                                                                                                                                                                                                                                                                                                                                                        defaultuserpictureUploadChange(fileUrls) {
        this.ruleForm.picture = fileUrls;
    },
                                            onUpdateHandler() {
                              if((!this.ruleForm.zhanghao)&& 'yonghu'==this.flag){
        this.$message.error('账号不能为空');
        return
      }
                                                                  if((!this.ruleForm.mima)&& 'yonghu'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
                                                                                                                                                                                                                                                                                                                                                                                                                                                            if((!this.ruleForm.username)&& 'defaultuser'==this.flag){
        this.$message.error('用户名不能为空');
        return
      }
                                                                  if((!this.ruleForm.mima)&& 'defaultuser'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
                                                                                                                                                                                    if( 'defaultuser' ==this.flag && this.ruleForm.age&&(!isIntNumer(this.ruleForm.age))){
       this.$message.error(`年龄应输入整数`);
        return
      }
                                                                              if( 'defaultuser' ==this.flag && this.ruleForm.phone&&(!isPhone(this.ruleForm.phone))){
        this.$message.error(`电话应输入电话格式`);
        return
      }
                                                                                                                                    if( 'defaultuser' ==this.flag && this.ruleForm.email&&(!isEmail(this.ruleForm.email))){
        this.$message.error(`邮箱应输入邮箱格式`);
        return
      }
                                                                  this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>
