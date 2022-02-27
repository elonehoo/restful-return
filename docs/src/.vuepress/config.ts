import { defineUserConfig } from 'vuepress'
import type { DefaultThemeOptions } from 'vuepress'

export default defineUserConfig<DefaultThemeOptions>({
  // 站点配置
  lang: 'en-US',
  title: 'restful-return',
  description: 'SpringBoot based return value types are supported by browsers.',
  themeConfig: {
    logo: 'logo/logo.svg',
  },
})
