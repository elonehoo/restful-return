import { defineUserConfig } from 'vuepress'
import type { DefaultThemeOptions } from 'vuepress'
import {version} from '../../package.json'

export default defineUserConfig<DefaultThemeOptions>({
  base:'/restful-return/',
  // 站点配置
  lang: 'en-US',
  title: 'restful-return',
  description: 'SpringBoot based return value types are supported by browsers.',
  themeConfig: {
    logo: 'logo/logo.svg',
	repo:'xiaoxunyao/restful-return',
	navbar: [
        {
          text: 'Guide',
          link: '/guide/',
        },
		{
			text: 'API',
			link: '/api/',
		  },
        {
          text: 'Issue',
          link: 'https://github.com/xiaoxunyao/restful-return/issues'
        },
		/**
        {
          text: 'Languages',
          children: [
            {
              text: 'English',
              link: '/',
            },
            {
              text: '中文',
              link: '/zh/',
            },
          ]
        },
		*/
        {
          text: `v${version}`,
          children: [
            {
              text: 'Release Notes ',
              link: 'https://github.com/xiaoxunyao/restful-return/releases',
            },
            {
              text: 'Contributing',
              link: 'https://github.com/xiao-akatsuki/axios.org/graphs/contributors',
            },
          ]
        }
      ],
	  sidebar:{
		'/guide/': [
			{
			  text: 'Guide',
			  children: ['/guide/why.md', '/guide/getting-started.md'],
			},
		],
		'/api/': [
			{
			  text: '',
			  children: ['/api/README.md',],
			},
		],
	  }
  },
})
