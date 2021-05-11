import request from '@/utils/request'

// 查询消息列表列表
export function listMessage(query) {
  return request({
    url: '/system/message/list',
    method: 'get',
    params: query
  })
}

// 查询消息列表详细
export function getMessage(userId) {
  return request({
    url: '/system/message/' + userId,
    method: 'get'
  })
}

// 新增消息列表
export function addMessage(data) {
  return request({
    url: '/system/message',
    method: 'post',
    data: data
  })
}

// 修改消息列表
export function updateMessage(data) {
  return request({
    url: '/system/message',
    method: 'put',
    data: data
  })
}

// 删除消息列表
export function delMessage(userId) {
  return request({
    url: '/system/message/' + userId,
    method: 'delete'
  })
}

// 导出消息列表
export function exportMessage(query) {
  return request({
    url: '/system/message/export',
    method: 'get',
    params: query
  })
}